import { Component, OnInit } from '@angular/core';
import { FormGroup, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  public bookTrade !: FormGroup;
  
  message:string = '';
  amount:string='';
  name:string='';
  ratemsg: string='';
  responsemsg:string='';
  currencypair:any[]=[
    {
      currencypair:"USDINR",
    }
  ];
  isChecked: any;
  load:any=<fxdetails>{};
  constructor(private service:HttpService,
              private router:Router) { }

  ngOnInit(): void {
  }

  onBook(f:NgForm){

    let obj={
      name:f.value.name,
      currencypair:f.value.currencypair,
      amount:f.value.amount
    }

    console.log(obj);
    this.service.booking(obj).subscribe((response:any)=>
    {
      alert("Your Trade was Booked Successfully.....");
      console.log(response);
      this.responsemsg=response;
    })
  }

onChange(myevent:any){
  if(myevent.value==1){
    this.amount=(<HTMLInputElement>document.getElementById("amount")).value;
    this.name=(<HTMLInputElement>document.getElementById("name")).value;
    console.log((<HTMLInputElement>document.getElementById("amount")).value)
    console.log((<HTMLInputElement>document.getElementById("name")).value)
    console.log((<HTMLInputElement>document.getElementById("currencypair")).value)
    this.ratemsg='you are transferring INR '+(66.00*(+this.amount))+' to '+this.name +' and (Assuming the rate was 66.00)';
   
  }
 }
 onCancel(){
  alert("Trade is Canceled. ");
this.router.navigate(['']);
 }

 onBack(){
  this.router.navigate(['']);
 }

}
