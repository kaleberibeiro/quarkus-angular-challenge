import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ResultLabseqComponent } from "../result-labseq/result-labseq.component";
import { NgClass, NgIf } from '@angular/common';
import { LabseqServiceService } from '../labseq-service.service';

@Component({
  selector: 'app-form-container',
  imports: [FormsModule, ResultLabseqComponent, NgIf, NgClass],
  templateUrl: './form-container.component.html',
  styleUrl: './form-container.component.css'
})
export class FormContainerComponent {

  n = 0
  result = 0
  hasValue = false
  error = ''

  constructor(private labseqServ: LabseqServiceService) { }

  getLabSeqNum(): void {
    this.labseqServ.getLabSeqNum(this.n).subscribe({
      next: (response) => {
        this.error = ''
        this.hasValue = true
        this.result = response
      },
      error: (error) => {
        this.error = error.error.error;
        this.hasValue = false
      }
    })
  }
}
