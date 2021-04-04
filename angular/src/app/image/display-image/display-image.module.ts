import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common'
import {FormsModule} from '@angular/forms';
import {DisplayImageComponent} from './display-image.component';
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

// import {UploadImageService} from './upload-image.service';

@NgModule({
    imports: [
        HttpClientModule,
        FormsModule,
        CommonModule
    ],
    providers: [
        // UploadImageService
    ],
    exports:[
        DisplayImageComponent
    ],
    declarations: [
        DisplayImageComponent,
    ]
  })
 export class UploadImageModule{ }
  