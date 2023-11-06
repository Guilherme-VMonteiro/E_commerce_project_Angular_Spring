import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaSectionComponent } from './lista-section.component';

describe('ListaSectionComponent', () => {
  let component: ListaSectionComponent;
  let fixture: ComponentFixture<ListaSectionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaSectionComponent]
    });
    fixture = TestBed.createComponent(ListaSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
