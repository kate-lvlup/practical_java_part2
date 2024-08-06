package jom.com.softserve.s2.task4;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Employee> largestEmployees(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return Collections.emptyList();
        }
        List<Employee> filteredEmployees  = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp != null) {
                filteredEmployees.add(emp);
            }
        }
        if (filteredEmployees.isEmpty()) {
            return Collections.emptyList();
        }
        Integer maxExperienceEmployee = null;
        BigDecimal maxPaymentEmployee = null;
        Integer maxExperienceManager = null;
        BigDecimal maxPaymentManager = null;
        for (Employee emp : filteredEmployees) {
            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                if (maxExperienceManager == null || manager.getExperience() > maxExperienceManager) {
                    maxExperienceManager = manager.getExperience();
                }
                if (maxPaymentManager == null || manager.getPayment().compareTo(maxPaymentManager) > 0) {
                    maxPaymentManager = manager.getPayment();
                }
            } else {
                if (maxExperienceEmployee == null || emp.getExperience() > maxExperienceEmployee) {
                    maxExperienceEmployee = emp.getExperience();
                }
                if (maxPaymentEmployee == null || emp.getPayment().compareTo(maxPaymentEmployee) > 0) {
                    maxPaymentEmployee = emp.getPayment();
                }
            }
        }

        Set<Employee> result = new HashSet<>();
        for (Employee emp : filteredEmployees) {
            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                if ((maxExperienceManager != null && manager.getExperience() == maxExperienceManager) ||
                        (maxPaymentManager != null && manager.getPayment().compareTo(maxPaymentManager) == 0)) {
                    result.add(manager);
                }
            } else {
                if ((maxExperienceEmployee != null && emp.getExperience() == maxExperienceEmployee) ||
                        (maxPaymentEmployee != null && emp.getPayment().compareTo(maxPaymentEmployee) == 0)) {
                    result.add(emp);
                }
            }
        }
        return new ArrayList<>(result);
    }
}
