import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { StudentRegister } from '../student/register-student/StudentRegister';
import { StudentLogin } from '../student/StudentLogin';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl: string = 'http://localhost:8090/stud-api';

  constructor(private http: HttpClient) { 
    
  }

  loginStudent(student: StudentLogin) : Observable<boolean> {
    return this.http.post<boolean>(this.baseUrl + '/loginStudent', student);
  }

  registerStudent(newStudent: StudentRegister) : Observable<any> {
    return this.http.post<StudentRegister[]>(this.baseUrl + '/registerStudent', newStudent);
  } 

}
