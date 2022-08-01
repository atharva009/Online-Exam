import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from 'src/app/Services/admin.service';
import { StudentService } from 'src/app/Services/student.service';
import { StudentLogin } from 'src/app/student/StudentLogin';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  studentLoginForm!: FormGroup;
  student!: StudentLogin;

  registeredId : number = 0;
  registeredFirstName : string = "";

  constructor(
    private fb: FormBuilder,
    private stuService: StudentService,
    private router: Router,
    private routeD: ActivatedRoute
  ) {
    routeD.params.subscribe(params => {
      this.registeredId = params['registerId'],
      this.registeredFirstName = params['registerFirstName']
    })
  }

  ngOnInit(): void {
    this.studentLoginForm = this.fb.group({
      studentId: ['', Validators.required],
      studentPassword: ['', Validators.required]
    });

    // this.onLogin();
  }

  resp: boolean = false;

  onLogin() {

    this.student = this.studentLoginForm.value;
    console.log(this.student.studentId);


      console.log('inside student Login: ' + this.student);

    this.stuService.loginStudent(this.student).subscribe((response) => {
      console.log(response);
      this.resp = response;
    });
    this.routeStu(this.resp);

  }

  routeStu(resp : boolean) {
    // ((this.resp === true) ? this.router.navigate(['dashboard']) : console.log("invalid creds"));
    if(resp == true) {
      this.router.navigate(["/dashboard", {
        'studCred' : this.student.studentId
      }])
    } else {
      console.log('invalid creds');
    }
  }

}
