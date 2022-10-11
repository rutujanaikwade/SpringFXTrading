import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BookingComponent } from './booking/booking.component';
import { HomeComponent } from './home/home.component';
import { PrintingComponent } from './printing/printing.component';

const routes: Routes = [
   {
     path:"booking",component:BookingComponent
   },
   {
    path:"",component:HomeComponent
   },
   {
    path:"printing",component:PrintingComponent
   }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
