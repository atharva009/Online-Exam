import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'dashboard-admin',
  templateUrl: './dashboard-admin.component.html',
  styleUrls: ['./dashboard-admin.component.css']
})
export class DashboardAdminComponent implements OnInit {

  adminId: number = 0;

  constructor(private routeD: ActivatedRoute) { 
    routeD.params.subscribe(params => {
      this.adminId = params['admCred']
    })
  }

  ngOnInit(): void {
  }

}
