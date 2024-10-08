package com.example.project.service;
import com.example.project.entity.Report;
import com.example.project.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public void save(Report report) {
        reportRepository.save(report);
    }

    public Optional<Report> findByReportId(String reportId) {
        return reportRepository.findById(reportId);

    }

    public List<Report> findByUserId(String userId) {
        return reportRepository.findByUserId(userId);
    }

    public void deleteByReportId(String reportId) {
        reportRepository.deleteById(reportId);
    }
}
