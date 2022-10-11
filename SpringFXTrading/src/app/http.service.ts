import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  bookTrades(value: any) {
    throw new Error('Method not implemented.');
  }
  
  private baseurl :string ="http://localhost:8080/";

  constructor(private http:HttpClient ) { }

booking(obj:any){

 return (this.http.post(`${this.baseurl}booktrade`,obj))

}
getAllEmp(){
  return  (this.http.get(`${this.baseurl}getallemployee`))
 }

 printing(): Observable<any>  {
  return this.http.get(`${this.baseurl }printtrade`);
}

confirmation(bookOrCancel:any){
  return this.http.get(`${this.baseurl }bookOrCancel`);
}
rateChange(rate:string){
  return this.http.get(`${this.baseurl }`);
}
}
