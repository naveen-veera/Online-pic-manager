// import {Injectable} from '@angular/core';
// import {HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
// import {HttpHeaders, HttpResponse} from '@angular/common/http';
// import {Observable} from 'rxjs';

// @Injectable({
//     providedIn: 'root'
//   })
// export class UploadImageService{
//     constructor(private http: HttpClient){}
//     public uploadImage(image: File): Observable<any>{
//         const formData = new FormData();
//         formData.append('image', image);
//         return this.http.post('http://localhost:8080/api/image/upload-image',formData);
//     }
// }