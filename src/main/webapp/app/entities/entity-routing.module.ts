import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'appointment',
        data: { pageTitle: 'blogdemojhipsterApp.appointment.home.title' },
        loadChildren: () => import('./appointment/appointment.module').then(m => m.AppointmentModule),
      },
      {
        path: 'manager',
        data: { pageTitle: 'blogdemojhipsterApp.manager.home.title' },
        loadChildren: () => import('./manager/manager.module').then(m => m.ManagerModule),
      },
      {
        path: 'company',
        data: { pageTitle: 'blogdemojhipsterApp.company.home.title' },
        loadChildren: () => import('./company/company.module').then(m => m.CompanyModule),
      },
      {
        path: 'bank',
        data: { pageTitle: 'blogdemojhipsterApp.bank.home.title' },
        loadChildren: () => import('./bank/bank.module').then(m => m.BankModule),
      },
      {
        path: 'adviser',
        data: { pageTitle: 'blogdemojhipsterApp.adviser.home.title' },
        loadChildren: () => import('./adviser/adviser.module').then(m => m.AdviserModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
