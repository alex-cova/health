package com.ezpc.domain.doctor;

import java.util.UUID;

public interface DoctorRepository {

    DoctorRepresentation getById(UUID doctorId);


}
