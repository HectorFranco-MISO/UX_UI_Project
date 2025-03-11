import { Component } from '@angular/core';

@Component({
  selector: 'app-register-email',
  templateUrl: './register-email.component.html',
  styleUrls: ['./register-email.component.scss']
})
export class RegisterEmailComponent {
  password: string = ''

  goBack() {
    window.history.back()
  }

}
