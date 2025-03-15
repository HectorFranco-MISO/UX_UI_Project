import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-email',
  templateUrl: './register-email.component.html',
  styleUrls: ['./register-email.component.scss'],
})
export class RegisterEmailComponent {
  name: string = '';
  password: string = '';
  confirmPassword: string = '';

  constructor(private router: Router) {}

  goBack() {
    window.history.back();
  }

  register() {
    if (this.password === this.confirmPassword && this.name.length > 5) {
      setTimeout(() => {
        this.router.navigate(['/escritorio']);
      }, 300);
    }
  }
}
