import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { DisplayQuestionsComponent } from './question/display-questions/display-questions.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import { DisplayCourseComponent } from './course/display-course/display-course.component';
import { RegisterStudentComponent } from './student/register-student/register-student.component';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { LoginAdminComponent } from './admin/login-admin/login-admin.component';
import { StartTestComponent } from './student/start-test/start-test.component';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    DisplayQuestionsComponent,
    NavbarComponent,
    LoginComponent,
    DisplayCourseComponent,
    RegisterStudentComponent,
    DashboardAdminComponent,
    LoginAdminComponent,
    StartTestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
