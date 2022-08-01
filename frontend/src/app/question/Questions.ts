export class Question {
  questionId: number = 0;
  questionDesc: String = '';
  questionOptionA: String = '';
  questionOptionB: String = '';
  questionOptionC: String = '';
  questionOptionD: String = '';
  questionAnswer: String = '';

  constructor(
    questionId: number,
    questionDesc: String,
    questionOptionA: String,
    questionOptionB: String,
    questionOptionC: String,
    questionOptionD: String,
    questionAnswer: String
  ) {
    this.questionId = questionId;
    this.questionDesc = questionDesc;
    this.questionOptionA = questionOptionA;
    this.questionOptionB = questionOptionB;
    this.questionOptionC = questionOptionC;
    this.questionOptionD = questionOptionD;
    this.questionAnswer = questionAnswer;
  }
}
