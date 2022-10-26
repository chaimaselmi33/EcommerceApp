import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/Models/customer';
import { OrderItem } from 'src/app/Models/orderItem';
import { CustomerService } from 'src/app/Services/customer.service';
import { SharedService } from 'src/app/Services/shared.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  orderItems !: OrderItem[];
  subTotalSum !: Number;
  shipping : number = 7;
  Total !:Number;
  c = new Customer();

  constructor( private customerService : CustomerService, private shared : SharedService) { }

  ngOnInit(): void {
    this.subTotalSum = this.shared.getSubTotalSum();
  }

  onSubmit(data : any){
    
    console.log("form",data);
    /*this.customerService.register(data).subscribe(  
      res => {
        console.log("form", data);
      }
    )*/
  }

}
