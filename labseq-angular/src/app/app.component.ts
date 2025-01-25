import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PopUpComponent } from "./pop-up/pop-up.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, PopUpComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'labseq-angular';
}
