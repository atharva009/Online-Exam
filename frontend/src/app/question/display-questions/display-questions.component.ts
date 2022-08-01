import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Question } from '../Questions';

@Component({
  selector: 'display-questions',
  templateUrl: './display-questions.component.html',
  styleUrls: ['./display-questions.component.css']
})
export class DisplayQuestionsComponent implements OnInit {

  courseId : number = 0; //from prev component
  questionList : Question[] = [];
  points : number = 0;


  constructor(private router: Router, private routeD: ActivatedRoute) { 
    routeD.params.subscribe(params => {
      console.log(params['courseId']);
      this.courseId = params['courseId'];
    })
  }

  ngOnInit(): void {
  }

}
