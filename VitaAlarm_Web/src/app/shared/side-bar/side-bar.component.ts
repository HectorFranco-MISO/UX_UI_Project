import { Component } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.scss']
})
export class SideBarComponent {
  visible: boolean = true;
  activePath: string = '';

  menuItems = [
    { label: 'Escritorio', icon: 'pi pi-pencil', path: '/escritorio' },
    { label: 'Alarmas inteligentes', icon: 'pi pi-microchip', path: '/alarmas-ia' },
    { label: 'Integración e-mail', icon: 'pi pi-envelope', path: '/email' },
    { label: 'Gestionar perfiles', icon: 'pi pi-users', path: '/perfiles' }
  ];

  constructor(private router: Router) { }

  ngOnInit() {
    this.activePath = this.router.url;

    this.router.events.subscribe(event => {
      if (event instanceof NavigationEnd) {
        this.activePath = event.url;
      }
    });
  }
}