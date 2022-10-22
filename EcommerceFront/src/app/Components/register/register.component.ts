import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/Services/customer.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor( private customerService : CustomerService) { }

  ngOnInit(): void {
  }

  onSubmit(data : any){
    this.customerService.register(data).subscribe(  
      res => {
        console.log("form", data);
      }
    )
  }

}
