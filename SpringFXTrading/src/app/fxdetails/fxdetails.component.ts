import { Component, OnInit } from '@angular/core';
import { stringify } from 'querystring';

@Component({
  selector: 'app-fxdetails',
  templateUrl: './fxdetails.component.html',
  styleUrls: ['./fxdetails.component.css']
})
export class FxdetailsComponent implements OnInit {

  name:string;
  currencypair:string;
  
  constructor() { }

  ngOnInit(): void {

   

  }

}
