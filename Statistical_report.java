import java.util.*;

public class Statistical_report {

	private String startDate;
	private String endDate;
	private Snapshot_Insurance_Proposal_Catalog snapshot_catalog;
	private Snapshot_Insurance_Proposal[] snapshots_insurance_proposals;
	public Statistical_report() {
	}
	
	public Statistical_report(String astartDate, String aendDate, Snapshot_Insurance_Proposal_Catalog asnapshot_catalog) {
		startDate = astartDate;
		endDate = aendDate;
		snapshots_insurance_proposals = asnapshot_catalog.get_Snapshot_Insurance_Proposals_by_period(startDate, endDate);
	}
	
	public String getStartDate() {
		return this.startDate;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Snapshot_Insurance_Proposal[] getSnapshots_insurance_proposals() {
		return this.snapshots_insurance_proposals;
	}

	/**
	 * 
	 * @param snapshots_insurance_proposals
	 */
	public void setSnapshots_insurance_proposals(Snapshot_Insurance_Proposal[] snapshots_insurance_proposals) {
		this.snapshots_insurance_proposals = snapshots_insurance_proposals;
	}
	
	/**
	 * 
	 * δεν εμφανιστηκε στα διαγράμματα γιατι η διαδικασία αυτη σε πραγματικο σενάριο θα γινόταν πολυ ευκολα μεσο της ΒΔ χωρις να χρειαστει η μεθοδος αυτη
	 */
	public void printData() {
		String[] dates = getDates();
		Agent[] agents = getAgents();
		int[][] amount = new int[dates.length][agents.length]; //The amount of Insurance Proposals that the specific Agent made that date
		for (int i = 0; i < dates.length; i++) {
			for (int j = 0; j < agents.length; j++ ) {
				amount[i][j] = 0;
			}
		}
		for (int i = 0; i < snapshots_insurance_proposals.length; i++) {
			Snapshot_Insurance_Proposal tempSnap = snapshots_insurance_proposals[i];
			for (int j = 0; j < dates.length; j++ ) {
				String date = dates[j];
				if (date == tempSnap.getDate()) {
					for (int l = 0; l < agents.length; l++ ) {
						Agent agent = agents[l];
						if (agent == tempSnap.getAgent()) {
							amount[j][l]++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < dates.length; i++) {
			System.out.println(String.format("%s:", dates[i]));
			for (int j = 0; j < agents.length; j++ ) {
				System.out.println(String.format("    %s: %d", agents[j].getName(), amount[i][j]));
			}
		}
	}
	
	
	/**
	 * 
	 * δεν εμφανιστηκε στα διαγράμματα γιατι η διαδικασία αυτη σε πραγματικο σενάριο θα γινόταν πολυ ευκολα μεσο της ΒΔ χωρις να χρειαστει η μεθοδος αυτη
	 */
	private String[] getDates() {
		Set<String> datesSet = new HashSet<String>();
		for (int i = 0; i < snapshots_insurance_proposals.length; i++) {
			datesSet.add(snapshots_insurance_proposals[i].getDate());
		}
		String[] dates = new String[datesSet.size()];
		dates = datesSet.toArray(dates);
		return dates;
	}
	
	/**
	 * 
	 * δεν εμφανιστηκε στα διαγράμματα γιατι η διαδικασία αυτη σε πραγματικο σενάριο θα γινόταν πολυ ευκολα μεσο της ΒΔ χωρις να χρειαστει η μεθοδος αυτη
	 */
	private Agent[] getAgents() {
		Set<Agent> agentsSet = new HashSet<Agent>();
		for (int i = 0; i < snapshots_insurance_proposals.length; i++) {
			agentsSet.add(snapshots_insurance_proposals[i].getAgent());
		}
		Agent[] agents = new Agent[agentsSet.size()];
		agents = agentsSet.toArray(agents);
		return agents;
	}




}