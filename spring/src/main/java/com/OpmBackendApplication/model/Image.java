package com.OpmBackendApplication.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
@CrossOrigin (origins = "http://localhost:4200")
@Table(name = "image_table")
public class Image {

	public Image(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	@Id
	@Column(name = "id", length = 10000)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 10000)
	private String name;

	@Column(name = "type", length = 10000)
	private String type;

    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	@Column(name = "picByte", length = 1000000000)
	private byte[] picByte;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Post post;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	public Post getPost(){
		return post;
	}
	public void setPost(Post post){
		this.post = post;
	}
}