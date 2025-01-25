import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-result-labseq',
  imports: [],
  templateUrl: './result-labseq.component.html',
  styleUrl: './result-labseq.component.css'
})
export class ResultLabseqComponent {

  @Input() result = 0;

}
