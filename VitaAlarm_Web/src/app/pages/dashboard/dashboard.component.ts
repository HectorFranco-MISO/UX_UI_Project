import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent {
  selectedDate: Date | null = null;
  alarms = [
    { title: 'Despertarse', hour: '07:00 A.M', days: 'Todos los días', active: true },
    { title: 'Ejercicio', hour: '06:00 P.M', days: 'Lunes, Miércoles, Viernes', active: true },
    { title: 'Leer', hour: '09:00 P.M', days: 'Todos los días', active: false },
  ];

  profileCards = [
    { image: 'L', title: 'Trabajo', description: 'Técnica pomodoro', active: false },
    { image: 'E', title: 'Ejercicio', description: 'Rutina diaria', active: true },
    { image: 'L', title: 'Lectura', description: '30 minutos', active: false },
    { image: 'M', title: 'Meditación', description: '10 minutos', active: false }
  ];

  addAlarm() {
    console.log("Añadir nueva alarma");
  }
}
