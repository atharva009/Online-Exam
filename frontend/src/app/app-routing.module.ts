import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardAdminComponent } from './admin/dashboard-admin/dashboard-admin.component';
import { LoginAdminComponent } from './admin/login-admin/login-admin.component';
import { LoginComponent } from './components/login/login.component';
import { DisplayCourseComponent } from './course/display-course/display-course.component';
import { DisplayQuestionsComponent } from './question/display-questions/display-questions.component';
import { DashboardStudentComponent } from './student/dashboard-student/dashboard-student.component';
import { RegisterStudentComponent } from './student/register-student/register-student.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'dashboard', component: DashboardStudentComponent },
  { path: 'displayQuestions', component: DisplayQuestionsComponent },
  { path: 'register', component: RegisterStudentComponent },
  { path: 'dashboardAdm', component: DashboardAdminComponent },
  { path: 'adminLogin', component: LoginAdminComponent },
  { path: 'displayCourse', component: DisplayCourseComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

export const routingComponents = [
  LoginComponent,
  DashboardStudentComponent,
  DisplayQuestionsComponent,
  RegisterStudentComponent,
  DashboardAdminComponent,
  DisplayCourseComponent
];
