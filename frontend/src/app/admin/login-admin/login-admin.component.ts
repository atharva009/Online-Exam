import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from 'src/app/Services/admin.service';
import { AdminLogin } from './AdminLogin';

@Component({
  selector: 'login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.css']
})
export class LoginAdminComponent implements OnInit {

  adminLoginForm !: FormGroup;
  admin !: AdminLogin;

  registeredId : number = 0;
  registeredFirstName : string = '';

  constructor(
    private fb: FormBuilder,
    private admService: AdminService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.adminLoginForm = this.fb.group({
      adminId: ['', Validators.required],
      adminPassword: ['', Validators.required]
    });
  }

  resp: boolean = false;

  onLogin() {

    this.admin = this.adminLoginForm.value;
    console.log(this.admin.adminId);

    console.log('inside admin login: ' + this.admin);

    this.admService.loginAdmin(this.admin).subscribe((response) => {
      console.log(response);
      this.resp = response;
    });
    this.routeAdm(this.resp);

  }

  routeAdm(resp: boolean) {
    if(resp == true) {
      this.router.navigate(["/dashboardAdm", {
        'admCred' : this.admin.adminId
      }])
    } else {
      console.log('invalid creds.');
    }
  }

}
