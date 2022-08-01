import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CourseService } from 'src/app/Services/course.service';
import { EnrollStudent } from '../EnrollStudent';
import { CourseDetails } from './CourseDetails';

@Component({
  selector: 'display-course',
  templateUrl: './display-course.component.html',
  styleUrls: ['./display-course.component.css'],
})
export class DisplayCourseComponent implements OnInit {
  courseList: CourseDetails[] = [];
  enrollCourse!: FormGroup;
  courseSelected!: CourseDetails;
  courseId : number = 0;
  studentId : number = 0;

  constructor(
    private http: CourseService,
    private router: Router,
    private fb: FormBuilder,
    private routeD: ActivatedRoute
  ) {
    routeD.params.subscribe((params) => {
      this.studentId = params['studId']
    });
  }

  ngOnInit(): void {
    this.enrollCourse = this.fb.group({
      courseId: ['', Validators.required],
    });

    this.coursesDisplay();
  }

  coursesDisplay() {
    this.http.courseDisplay().subscribe((response) => {
      console.table(response);
      this.courseList = response;
    });
  }

  enrStu : EnrollStudent = {
    courseId: 0,
    studentId: 0
  }

  onEnroll() {
    this.courseSelected = this.enrollCourse.value;

    // this.http.enrollCourse()

    // this.router.navigate(["/displayQuestions", {
    //   'courseId' : this.courseSelected.courseId
    // }])

    // console.log(this.studentId);

    this.courseId = this.courseSelected.courseId;
    this.enrStu.courseId = this.courseId;
    this.enrStu.studentId = this.studentId;

    console.log(typeof(this.enrStu.courseId));

    console.log('course id: ' + this.courseSelected.courseId);

    this.http.enrollCourse(this.enrStu).subscribe((response) => {
      console.log(response);
    });
  }


  startTest() {

    this.router.navigate(["/displayQuestions", {
      'courseId' : this.courseId
    }]);

  }

}
