export class Shopkeeper {


  id:number;
    name:string;
    password:string;
    location:string;


  constructor(id:number, name:string, password:string, location:string) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.location = location;
      }
}