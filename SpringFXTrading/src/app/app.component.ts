import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'fxtrading';

  ngOnInit(){
    document.body.className=".bg_background";
  }

}
