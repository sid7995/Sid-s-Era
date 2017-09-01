import {Component} from "@angular/core";

@Component({
    selector: 'carcare-app',
    template: `
        <div>
            <h1>{{title}}</h1>
            <a routerLink="car">Add Car</a>
            <a routerLink="customerLogin">Customer Login</a>
            <a routerLink="viewAllCars">view Cars</a>
            <a routerLink="dealerLogin">Dealer Login</a>
            <a routerLink="dealerCRUD">Dealer CRUD</a>
            <!--<a routerLink="employee">Show Employee</a>-->
            <!--<a routerLink="customer">Add Customer</a>-->
           <a routerLink="product">Add Product</a>
            <a routerLink="shopkeeper">Add Shopkeeper</a>
            <a routerLink="selectProduct">Select Product</a>
            <router-outlet></router-outlet>
        </div>`
})
export class AppComponent {

    title: string = "WELCOME TO HOTWHEELS!";

}
