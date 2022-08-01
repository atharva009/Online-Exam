import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Question } from '../question/Questions';

@Injectable({
  providedIn: 'root',
})
export class QuestionService {
  baseUrl: string = 'http://localhost:8090/question-api';

  constructor(private httpServ: HttpClient) {}

  public getQuestion() {
    return this.httpServ.get<Question[]>(
      this.baseUrl + '/displayQuestionJavaLevel1'
    );
  }
  public AddQues(ques: Question) {
    return this.httpServ.post<any>(
      this.baseUrl + '/addQuestionJavaLevel1',
      ques
    );
  }
  public updateQues(ques: Question) {
    return this.httpServ.post(this.baseUrl + '/updateQuestionJavaLevel1', ques);
  }

  public deleteQues(ques: Question) {
    return this.httpServ.post(this.baseUrl + '/removeQuestionJavaLevel1', ques);
  }
}
