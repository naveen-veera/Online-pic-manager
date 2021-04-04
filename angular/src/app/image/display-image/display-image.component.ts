import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-display-image',
  templateUrl: './display-image.component.html',
  styleUrls: ['./display-image.component.css']
})
export class DisplayImageComponent implements OnInit {
  // isImageLoading: boolean;
  // getCustomerImagesSubscription: any;
  // getCustomerService: any;
  // imageToShow: any;
  constructor(private httpClient: HttpClient) { }

  selectedFile: File;
  retrievedImage: any;
  base64Data: any;
  retrieveResonse: any;
  message: string;
  imageName: any;

  ngOnInit(): void {
  }
  //Gets called when the user clicks on retieve image button to get the image from back end
  
  getImage() {
    //Make a call to Spring Boot to get the Image Bytes.
    this.httpClient.get('http://localhost:8080/image/display-image/' + this.imageName)
      .subscribe(
        res => {
          this.retrieveResonse = res;
          this.base64Data = this.retrieveResonse.picByte;
          this.retrievedImage = 'data:image/jpeg;base64,' + this.base64Data;
        }
      );
  }
  // getCustomerImages() {
  //   this.isImageLoading = true;
  //   this.getCustomerImagesSubscription = this.getCustomerService.getCustomerImages(this.refNo).subscribe(
  //     data => {
  //       this.createImageFromBlob(data);
  //       this.isImageLoading = false;
  //     },
  //     error => {
  //       this.isImageLoading = false;
  //     });
  // }
  // refNo(refNo: any) {
  //   throw new Error('Method not implemented.');
  // }
  // createImageFromBlob(image: Blob) {
  //   let reader = new FileReader();
  //   reader.addEventListener("load",
  //     () => {
  //         this.imageToShow.photo = reader.result;
  //     },
  //     false);

  //   if (image) {
  //     if (image.type !== "application/pdf")
  //       reader.readAsDataURL(image);
  //   }
  // }

}
