// import {Injectable} from '@angular/core';
// import {HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
// import {HttpHeaders, HttpResponse} from '@angular/common/http';
// import {Observable} from 'rxjs';

// @Injectable({
//     providedIn: 'root'
//   })
// export class UploadImageService{
//     apiBaseUrl: any;
//     constructor(private http: HttpClient){}
//     getCustomerImages(customerNumber: number, type: string): Observable<File> {
//         let result: Observable<any> = this.http
//           .get(`${this.apiBaseUrl}csbins/Customer/${customerNumber}/images`, { responseType: "blob" });
//         return result;
//       }
// }
