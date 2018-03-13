import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Welcome to miniv3!';
  menuItems = [
    { caption: 'Login', link: ['/login'] },
    { caption: 'Register', link: ['/register'] }
  ];
  constructor() {}
}
