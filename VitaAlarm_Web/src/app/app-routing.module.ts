import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { AiAlarmsComponent } from './pages/ai-alarms/ai-alarms.component';
import { RegisterComponent } from './pages/register/register.component';
import { RegisterEmailComponent } from './pages/register-email/register-email.component';
import { RegisterSocialComponent } from './pages/register-social/register-social.component';

const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
    path: 'escritorio', component: DashboardComponent
  },
  {
    path: 'alarmas-ia', component: AiAlarmsComponent
  },
  {
    path: 'registro', component: RegisterComponent
  },
  {
    path: 'registro-correo', component: RegisterEmailComponent
  },
  {
    path: 'registro-social', component: RegisterSocialComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
