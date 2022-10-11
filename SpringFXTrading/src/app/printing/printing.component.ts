import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-printing',
  templateUrl: './printing.component.html',
  styleUrls: ['./printing.component.css']
})
export class PrintingComponent implements OnInit {
  EmpData:any[]=[];
  page :number=1;
  count:number=0;
  tableSize:number =10;
   tableSizes:any=[];  
 
 constructor(private service:HttpService ,
             private router:Router) { }

 ngOnInit(): void {
   this.tradeList();
 }


 tradeList(){
   this.service.printing().subscribe((EmpData)=>{
     this.EmpData=EmpData;
   })
 }
 onTableDataChange(event:any){
  
  this.page =event;
  console.log("hello");
  console.log(this.tradeList());
  this.tradeList();
 }

 onTableSizeChange(event:any):void{
  this.tableSize = event.target.value;
  this.page =1;
  this.tradeList();
 }
// onClick(){
//  this.router.navigate(['']);
// }

}