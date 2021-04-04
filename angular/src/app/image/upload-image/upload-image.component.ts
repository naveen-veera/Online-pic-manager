import { Component, OnInit } from '@angular/core';
// import { UploadImageService } from './upload-image.service';
import {HttpClient} from '@angular/common/http'

// class ImageSnippet{
//   constructor(public src: string, public file:File){

//   }
// }

@Component({
  selector: 'app-upload-image',
  templateUrl: './upload-image.component.html',
  styleUrls: ['./upload-image.component.css'],
})
export class UploadImageComponent {

    constructor(private httpClient: HttpClient) { }
  
    selectedFile: File;
    retrievedImage: any;
    base64Data: any;
    retrieveResonse: any;
    message: string;
    imageName: any;
  
    //Gets called when the user selects an image
    public onFileChanged(event) {
      //Select File
      this.selectedFile = event.target.files[0];
    }
  
    //Gets called when the user clicks on submit to upload the image
    onUpload() {
      console.log(this.selectedFile);
      
      //FormData API provides methods and properties to allow us easily prepare form data to be sent with POST HTTP requests.
      const uploadImageData = new FormData();
      uploadImageData.append('imageFile', this.selectedFile, this.selectedFile.name);
    
      //Make a call to the Spring Boot Application to save the image
      this.httpClient.post('http://localhost:8080/api/image/upload-image', uploadImageData, { observe: 'response' })
        .subscribe((response) => {
          if (response.status === 200) {
            this.message = 'Image uploaded successfully';
          } else {
            this.message = 'Image not uploaded successfully';
          }
        }
        );
    }
    // getImage() {
    //   //Make a call to Sprinf Boot to get the Image Bytes.
    //   this.httpClient.get('http://localhost:8080/image/display-image/' + this.imageName)
    //     .subscribe(
    //       res => {
    //         this.retrieveResonse = res;
    //         this.base64Data = this.retrieveResonse.picByte;
    //         this.retrievedImage = 'data:image/jpeg;base64,' + this.base64Data;
    //       }
    //     );
    // }
  
    
  }

  // selectedFile:ImageSnippet;
  // constructor(private imageService:UploadImageService){

  // }
  // processFile(imageInput: any){
  //   const file:File=imageInput.files[0];
  //   const reader = new FileReader();
  //   reader.addEventListener('load',(event:any)=>{
  //     debugger;
  //     this.selectedFile=new ImageSnippet(event.target.result,file);
  //     this.imageService.uploadImage(this.selectedFile.file).subscribe(
  //       (res) => {
  //         debugger;
  //       },
  //       (err) =>{
  //         debugger;
  //       })
  //   });
  //   reader.readAsDataURL(file);
  // }

// }
