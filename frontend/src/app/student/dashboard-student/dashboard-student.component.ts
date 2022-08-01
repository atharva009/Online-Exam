import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'dashboard-student',
  templateUrl: './dashboard-student.component.html',
  styleUrls: ['./dashboard-student.component.css']
})
export class DashboardStudentComponent implements OnInit {

  studentId : number = 0;

  constructor(private router: Router, private routeD: ActivatedRoute) { 
    routeD.params.subscribe(params => {
      this.studentId = params['studCred']
    })
  }
  
  ngOnInit(): void {
    this.routeToDisplayCourse();
  }

  startTest() {
    
  }

  routeToDisplayCourse() {
    this.router.navigate(["/displayCourse", {
      'studId' : this.studentId
    }])
  }

}
