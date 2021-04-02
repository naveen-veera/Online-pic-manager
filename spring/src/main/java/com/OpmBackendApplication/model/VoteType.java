package com.OpmBackendApplication.model;

import java.util.Arrays;

import com.OpmBackendApplication.exceptions.OpmException;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    private int direction;

    VoteType(int direction) {
    }

    public static VoteType lookup(Integer direction) {
        return Arrays.stream(VoteType.values())
                .filter(value -> value.getDirection().equals(direction))
                .findAny()
                .orElseThrow(() -> new OpmException("Vote not found"));
    }

    public Integer getDirection() {
        return direction;
    }
}
