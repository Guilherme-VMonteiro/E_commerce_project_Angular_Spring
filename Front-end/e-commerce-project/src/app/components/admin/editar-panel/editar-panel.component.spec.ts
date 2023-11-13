import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarPanelComponent } from './editar-panel.component';

describe('EditarPanelComponent', () => {
  let component: EditarPanelComponent;
  let fixture: ComponentFixture<EditarPanelComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditarPanelComponent]
    });
    fixture = TestBed.createComponent(EditarPanelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
