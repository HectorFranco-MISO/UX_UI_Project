import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AiAlarmsComponent } from './ai-alarms.component';

describe('AiAlarmsComponent', () => {
  let component: AiAlarmsComponent;
  let fixture: ComponentFixture<AiAlarmsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AiAlarmsComponent]
    });
    fixture = TestBed.createComponent(AiAlarmsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
