export class Customer {
    fn !: string;
    ln !: string;
    email !: string;
    numPhone !: string;
    town !: string;
    address !: string;
    zipCode !:  string;
    username !: string;
    password !: string;

    constructor(fn : string, ln :string, email :string, numPhone :string, town:string, address:string, zipCode:string, username:string, password:string){
        this.fn=fn;
        this.ln =ln;
        this.email =email;
        this.numPhone = numPhone;
        this.town =town;
        this.address= address;
        this.zipCode = zipCode;
        this.username = username;
        this.password = password;
    }
}
