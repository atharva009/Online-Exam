import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AdminLogin } from '../admin/login-admin/AdminLogin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  private baseUrl: string = 'http://localhost:8090/admin-api';

  constructor(private http: HttpClient) { }

  loginAdmin(admin: AdminLogin) : Observable<boolean> {
    return this.http.post<boolean>(this.baseUrl + '/loginAdmin', admin);
  }

}
