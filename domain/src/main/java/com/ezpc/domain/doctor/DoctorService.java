package com.ezpc.domain.doctor;

import java.util.UUID;

public interface DoctorService {

    String create(DoctorModel model);

    void delete(UUID uuid);

}

