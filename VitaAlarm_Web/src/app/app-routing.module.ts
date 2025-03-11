import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { AiAlarmsComponent } from './pages/ai-alarms/ai-alarms.component';

const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
    path: 'escritorio', component: DashboardComponent
  },
  {
    path: 'alarmas-ia', component: AiAlarmsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
