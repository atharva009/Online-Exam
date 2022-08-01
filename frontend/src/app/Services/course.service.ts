import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CourseDetails } from '../course/display-course/CourseDetails';
import { EnrollStudent } from '../course/EnrollStudent';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private baseUrl: string = 'http://localhost:8090/course-api';

  constructor(private http: HttpClient) { }

  courseDisplay() : Observable<any> {
    return this.http.get<CourseDetails[]>(this.baseUrl + '/displayCourse');
  }

  courseAdd(course: CourseDetails):  Observable<any>{
    return this.http.post<boolean>(this.baseUrl+'/addCourse',course);
  }

  courseRemove(id: number) {
    /*var data = [{"Spalte":id}];
    var s = data[0].Spalte + "";
    var d = parseInt(s);*/
    console.log(id);
    return this.http.post(`${this.baseUrl}/removeCourse/${id}`,id);
  }

  enrollCourse(enrStu: EnrollStudent) {
    return this.http.post(this.baseUrl + '/enrollCourse', enrStu);
  }

}
