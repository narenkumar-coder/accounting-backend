CREATE TABLE cost_sheet_entries (
    entry_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY, -- Auto increment ID
    project_name VARCHAR2(100) NOT NULL,
    direct_material NUMBER(10,2) NOT NULL,
    direct_labor NUMBER(10,2) NOT NULL,
    factory_overhead NUMBER(10,2),
    total_cost NUMBER(10,2),
    recorded_date DATE DEFAULT SYSDATE
);