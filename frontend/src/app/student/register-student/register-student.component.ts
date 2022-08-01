import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from 'src/app/Services/student.service';
import { StudentRegister } from './StudentRegister';

@Component({
  selector: 'register-student',
  templateUrl: './register-student.component.html',
  styleUrls: ['./register-student.component.css']
})
export class RegisterStudentComponent implements OnInit {

  registerForm !: FormGroup
  newStudent !: StudentRegister;

  constructor(private fb: FormBuilder, private http: StudentService, private router: Router) { }

  ngOnInit(): void {

    this.registerForm = this.fb.group({
      studentId: ['', Validators.required],
      studentFirstName: ['', Validators.required],
      studentLastName: ['', Validators.required],
      studentEmail: ['', Validators.required],
      studentPhone: ['', Validators.required],
      studentPassword: ['', Validators.required]
  });

  }

  onRegister() {

    this.newStudent = this.registerForm.value;
    console.table("inside register: " + this.newStudent);

    this.http.registerStudent(this.newStudent).subscribe(
      response => {
        console.log(response);
      }
    )
      this.router.navigate(["/login", {
        'registerId': this.newStudent.studentId,
        'registerFirstName': this.newStudent.studentFirstName 
      }])
  }

}
