import * as dayjs from 'dayjs';
import { IAdviser } from 'app/entities/adviser/adviser.model';
import { IManager } from 'app/entities/manager/manager.model';

export interface IAppointment {
  id?: number;
  reason?: string | null;
  date?: dayjs.Dayjs | null;
  adviser?: IAdviser | null;
  manager?: IManager | null;
}

export class Appointment implements IAppointment {
  constructor(
    public id?: number,
    public reason?: string | null,
    public date?: dayjs.Dayjs | null,
    public adviser?: IAdviser | null,
    public manager?: IManager | null
  ) {}
}

export function getAppointmentIdentifier(appointment: IAppointment): number | undefined {
  return appointment.id;
}
