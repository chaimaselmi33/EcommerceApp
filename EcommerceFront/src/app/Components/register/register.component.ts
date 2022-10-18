import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/Services/customer.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private custService : CustomerService) { }

  ngOnInit(): void {
  }

  onSubmit(value: any){
    this.custService.register(value).subscribe(res => 
      console.log("form", res));
  }
}
