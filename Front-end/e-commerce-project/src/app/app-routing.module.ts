import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home/home.component';
import { AdminPageComponent } from './components/admin/admin-page/admin-page.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "admin", component: AdminPageComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
