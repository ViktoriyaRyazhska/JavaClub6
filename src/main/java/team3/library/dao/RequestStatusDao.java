package team3.library.dao;

import team3.library.model.RequestStatus;

public interface RequestStatusDao {
    RequestStatus findById(int id);
}
